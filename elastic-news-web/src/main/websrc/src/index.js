import 'core-js/fn/object/assign';
import React from 'react';
import ReactDOM from 'react-dom';
import App from './components/App';



const Main = () => (
    <App />
);

// Render the main component into the dom
ReactDOM.render(<Main />, document.getElementById('app'));
