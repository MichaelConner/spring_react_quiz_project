import React from 'react';

const SearchInput = ({ value, onChange }) => {
   return <input value={value} onChange={onChange} className="search-input" />
  
}

export default SearchInput;