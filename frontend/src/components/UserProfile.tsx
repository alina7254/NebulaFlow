import React from 'react';

interface User {
  id: string;
  name: string;
  email: string;
}

interface UserProfileProps {
  user: User;
}

const UserProfile: React.FC<UserProfileProps> = ({ user }) => (
  <div className="card bg-base-100 shadow-lg p-4">
    <h2 className="text-xl font-semibold">Profile</h2>
    <p>Name: {user.name}</p>
    <p>Email: {user.email}</p>
  </div>
);

export default UserProfile;
