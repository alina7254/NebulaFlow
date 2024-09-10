import React, { useEffect, useState } from 'react';
import UserProfile from '../components/UserProfile';
import { getUser } from '../services/userService';

const UserProfilePage: React.FC = () => {
  const [user, setUser] = useState(null);

  useEffect(() => {
    const fetchUser = async () => {
      const user = await getUser('1'); 
      setUser(user);
    };
    fetchUser();
  }, []);

  return (
    <div className="p-4">
      <h1 className="text-2xl font-semibold">Profile</h1>
      {user && <UserProfile user={user} />}
    </div>
  );
};

export default UserProfilePage;
