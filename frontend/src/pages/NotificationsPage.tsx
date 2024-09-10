import React, { useEffect, useState } from 'react';
import NotificationList from '../components/NotificationList';
import { getNotifications } from '../services/notificationService';

const NotificationsPage: React.FC = () => {
  const [notifications, setNotifications] = useState([]);

  useEffect(() => {
    const fetchNotifications = async () => {
      const notifications = await getNotifications();
      setNotifications(notifications);
    };
    fetchNotifications();
  }, []);

  return (
    <div className="p-4">
      <h1 className="text-2xl font-semibold">Notifications</h1>
      <NotificationList notifications={notifications} />
    </div>
  );
};

export default NotificationsPage;
