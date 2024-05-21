package exam01;

public class Ex08 {


    class Ex08_1 implements Runnable {

        private volatile boolean stopped = false; // 정지 X
        private volatile boolean suspended = false; // 일시정지 X

        private Thread th;

        public Ex08_1(String name) {
            th = new Thread(this, name);

        }

        @Override
        public void run() {
            while (!stopped) {

            }
        }

        public void start() {
            th.start();
        }

        public void suspend() {
            suspended = true;
        }

        public void resume() {
            suspended = false;
        }

        public void stop() {
            stopped = true;
        }
    }
}