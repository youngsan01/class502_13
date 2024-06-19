package exam01;

import java.util.*;

class Player {
    String name;
    String team;
    int wins;
    int losses;

    public Player(String name, String team) {
        this.name = name;
        this.team = team;
        this.wins = 0;
        this.losses = 0;
    }
}

public class TeamMukJjiPpa {

    public static String[] moves = {"묵", "찌", "빠"};
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static List<Player> teamRed = new ArrayList<>();
    public static List<Player> teamBlue = new ArrayList<>();
    public static boolean isPvC;

    public static void main(String[] args) {
        System.out.println("묵찌빠 팀전 게임에 오신 것을 환영합니다!");

        // 0. PvP/PvC 선택
        System.out.println("PvP(Player verses Player) / PvC(Player verses Computer) 선택 (PvP / PvC): ");
        String gameMode = scanner.next();
        isPvC = gameMode.equalsIgnoreCase("PvC");

        // 1. 팀 인원 설정
        System.out.println("팀 인원을 정해주세요 (최대 4명): ");
        int teamSize = scanner.nextInt();

        // 2. 팀 선택 및 배정
        for (int i = 1; i <= teamSize; i++) {
            System.out.println("플레이어 " + i + "의 이름을 입력하세요: ");
            String playerName = scanner.next();
            if (i % 2 == 0) {
                teamBlue.add(new Player(playerName, "Blue"));
            } else {
                teamRed.add(new Player(playerName, "Red"));
            }
        }

        if (isPvC && teamSize % 2 != 0) {
            teamBlue.add(new Player("AI_Player", "Blue"));
        }

        // 4. 팀 배정 완료
        System.out.println("팀 배정 완료");
        printTeams();

        // 5. 대결 시작
        int redIndex = 0;
        int blueIndex = 0;

        while (redIndex < teamRed.size() && blueIndex < teamBlue.size()) {
            Player redPlayer = teamRed.get(redIndex);
            Player bluePlayer = teamBlue.get(blueIndex);

            System.out.println(redPlayer.name + " vs " + bluePlayer.name + "의 대결 시작!");

            if (mukJjiPpa(redPlayer, bluePlayer)) {
                redPlayer.wins++;
                bluePlayer.losses++;
                System.out.println(redPlayer.name + " 승리!");
            } else {
                bluePlayer.wins++;
                redPlayer.losses++;
                System.out.println(bluePlayer.name + " 승리!");
            }

            redIndex++;
            blueIndex++;
        }

        // 8. 결과 창 띄우기
        printResults();

        // 9. 다시 하기/게임 종료
        System.out.println("게임을 다시 하시겠습니까? (yes / no): ");
        String replay = scanner.next();
        if (replay.equalsIgnoreCase("yes")) {
            main(args); // 다시 시작
        } else {
            System.out.println("게임을 종료합니다.");
        }
    }

    public static boolean mukJjiPpa(Player player1, Player player2) {
        String currentWinner = "없음";
        while (true) {
            String p1Move = getPlayerMove(player1);
            String p2Move = getPlayerMove(player2);

            System.out.println(player1.name + ": " + p1Move + " vs " + player2.name + ": " + p2Move);

            if (p1Move.equals(p2Move)) {
                if (currentWinner.equals(player1.name)) {
                    return true;
                } else if (currentWinner.equals(player2.name)) {
                    return false;
                }
            } else {
                currentWinner = decideWinner(p1Move, p2Move, player1, player2);
            }
        }
    }

    public static String getPlayerMove(Player player) {
        if (isPvC && player.name.equals("AI_Player")) {
            return moves[random.nextInt(3)];
        } else {
            System.out.println(player.name + "의 묵, 찌, 빠 중 하나를 선택하세요: ");
            String move = scanner.next();
            while (!Arrays.asList(moves).contains(move)) {
                System.out.println("잘못된 입력입니다. 다시 선택하세요 (묵, 찌, 빠): ");
                move = scanner.next();
            }
            return move;
        }
    }

    public static String decideWinner(String p1Move, String p2Move, Player player1, Player player2) {
        if (p1Move.equals("묵") && p2Move.equals("찌") ||
                p1Move.equals("찌") && p2Move.equals("빠") ||
                p1Move.equals("빠") && p2Move.equals("묵")) {
            return player1.name;
        } else {
            return player2.name;
        }
    }

    public static void printTeams() {
        System.out.println("Red 팀:");
        for (Player player : teamRed) {
            System.out.println(player.name);
        }
        System.out.println("Blue 팀:");
        for (Player player : teamBlue) {
            System.out.println(player.name);
        }
    }

    public static void printResults() {
        System.out.println("게임 결과:");
        System.out.println("Red 팀:");
        for (Player player : teamRed) {
            System.out.println(player.name + " - " + player.wins + "승 " + player.losses + "패");
        }
        System.out.println("Blue 팀:");
        for (Player player : teamBlue) {
            System.out.println(player.name + " - " + player.wins + "승 " + player.losses + "패");
        }

        int redWins = teamRed.stream().mapToInt(p -> p.wins).sum();
        int blueWins = teamBlue.stream().mapToInt(p -> p.wins).sum();

        if (redWins > blueWins) {
            System.out.println("Red 팀 승리!");
        } else {
            System.out.println("Blue 팀 승리!");
        }
    }
}
