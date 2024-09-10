import React from 'react';

interface CardProps {
  children: React.ReactNode;
}

const Card: React.FC<CardProps> = ({ children }) => (
  <div className="card shadow-lg p-4 bg-base-100">
    {children}
  </div>
);

export default Card;

