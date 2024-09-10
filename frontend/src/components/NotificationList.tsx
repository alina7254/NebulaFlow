import React from 'react';

interface Notification {
  id: string;
  message: string;
}

interface NotificationListProps {
  notifications: Notification[];
}

const NotificationList: React.FC<NotificationListProps> = ({ notifications }) => (
  <div className="space-y-4">
    {notifications.map(notification => (
      <div key={notification.id} className="card bg-info shadow-lg p-4">
        <p>{notification.message}</p>
      </div>
    ))}
  </div>
);

export default NotificationList;
