import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import TasksPage from '../pages/TasksPage';
import NotificationsPage from '../pages/NotificationsPage';
import UserProfilePage from '../pages/UserProfilePage';
import React from 'react';

const AppRouter = () => (
  <Router>
    <Routes>
      <Route path="/" element={<Navigate to="/profile" />} />
      <Route path="/tasks" element={<TasksPage />} />
      <Route path="/notifications" element={<NotificationsPage />} />
      <Route path="/profile" element={<UserProfilePage />} />
    </Routes>
  </Router>
);

export default AppRouter;

