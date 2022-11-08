import './App.css';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import ListLoanCardDetails from './components/ListLoanCardDetails';
import LoanHeaderComponent from './components/LoanHeaderComponent';
import LoanFooterComponent from './components/LoanFooterComponent';
import AddLoanCardComponent from './components/AddLoanCardComponent';


function App() {
  return (
    <div>
      <Router>
      <LoanHeaderComponent />
      <div className='container'>
        <Routes>
            <Route path = "/" element = {<ListLoanCardDetails />} />
            <Route path = "/loancards" element = {<ListLoanCardDetails />} />
            <Route path = "/loancards/add-loandetails" element = {<AddLoanCardComponent />} />
            <Route path = "/loancards/edit-loandetails/:id" element = {<AddLoanCardComponent />} />
        </Routes>
      
      </div>
      <LoanFooterComponent />
      </Router>
    </div>
  );
}

export default App;
