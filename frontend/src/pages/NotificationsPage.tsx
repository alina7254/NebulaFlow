import React, { useEffect, useState } from 'react';
import NotificationList from '../components/NotificationList';
import { getNotification } from '../services/notificationService';

const NotificationsPage: React.FC = () => {
  const [notifications, setNotifications] = useState([]);

  useEffect(() => {
    const fetchNotifications = async () => {
      const notifications = await getNotification('1');
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
