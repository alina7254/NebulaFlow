import React from 'react';

interface ButtonProps {
  children: React.ReactNode;
  onClick: () => void;
}

const Button: React.FC<ButtonProps> = ({ children, onClick }) => (
  <button className="btn btn-primary" onClick={onClick}>
    {children}
  </button>
);

export default Button;
