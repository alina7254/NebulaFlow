import axios from 'axios';

const NOTIFICATION_API_URL = 'http://notification-service:8080/api/notifications'; 

export const getNotification = async (id: string) => {
  try {
    const response = await axios.get(`${NOTIFICATION_API_URL}/${id}`);
    return response.data;
  } catch (error) {
    console.error('Error fetching notification', error);
    throw error;
  }
};

