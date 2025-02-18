package com.example.utility.patterns.bahavioral.iterator;

class NameRepository implements Container {
    private String[] names = {"John", "Jane", "Alice", "Bob"};
    
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    
    // Step 4: Create a concrete iterator class
    private class NameIterator implements Iterator {
        int index;
        
        @Override
        public boolean hasNext() {
            return index < names.length;
        }
        
        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}