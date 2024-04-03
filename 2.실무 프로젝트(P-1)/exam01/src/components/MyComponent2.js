import { Component } from 'react';
import PropTypes from 'prop-types';

class MyComponent extends Component {
  static defaultProps = {
    name : '기본이름',
  };
  render() {
    const { name, num, children} = this.props;
    return (
        
      <>
        <div>안녕하세요!, 제 이름은 {name}입니다.</div>
        <div>좋아하는 숫자는 {num}입니다.</div>
        {children}
      </>
    );
  }
}

MyComponent.propTypes = {
    name: PropTypes.string,
    num: PropTypes.number.isRequired,
};

export default MyComponent;
