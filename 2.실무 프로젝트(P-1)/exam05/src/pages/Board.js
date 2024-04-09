import React from 'react';
import { useParams, useLocation, useSearchParams } from 'react-router-dom';

const posts = {
  post1: {
    subject: '게시글1번',
    content: '게시글1 내용',
  },
  post2: {
    subject: '게시글2번',
    content: '게시글2 내용',
  },
};

const Board = () => {
  const { id } = useParams();
  const data = posts[`post${id}`];

  //const [useSearchParams, setSearchParams] = useSearchParams();
  //console.log(setSearchParams.get('key'));
  //setSearchParams('k1=v1&k2=v2');
  //console.log(setSearchParams.toString());

  //const location = useLocation();
  //console.log(location);

  return (
    <>
      {data ? (
        <>
          <h1>{data.subject}</h1>
          <div>{data.content}</div>
        </>
      ) : (
        <div>게시글이 없습니다.</div>
      )}
    </>
  );
};

export default React.memo(Board);
