import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
//import Quiz from './Quiz';
//import ShoppingApp from './shoppingapp'
//import TransportationApp from './TransportationApp'
//import Counter from './Counter';
//import Counter1 from './Counter1'
//import EventHandlers from './EventHandlers';
//import Button from './Button';
//import App1 from './App1';
//import Form from './Form';
//import Work from './Word';
//import Word from './Word';
//import SearchBooks from './SearchBooks';
import HomePage from './HomePage';

ReactDOM.render(<HomePage />, document.getElementById('root'));
registerServiceWorker();
