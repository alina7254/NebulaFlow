import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

export default defineConfig({
  plugins: [react()],
  server: {
    port: 3000,
    proxy: {
      '/api/tasks': {
        target: 'http://localhost:8081',
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api\/tasks/, ''),
        logLevel: 'debug'
      },
      '/api/notifications': {
        target: 'http://localhost:8082',
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api\/notifications/, ''),
        logLevel: 'debug'
      },
      '/api/users': {
        target: 'http://localhost:8080',  
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api\/users/, ''),
        logLevel: 'debug'
      }
    }
  }
});



