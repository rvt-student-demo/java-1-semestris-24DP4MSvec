package rvt;

public class OverloadedCounter {
   
     
        private int value;
        
        public OverloadedCounter(int startValue) {
        this.value = startValue;
        }
        public OverloadedCounter() {
            this.value = 0;
        }
        public int value(){
            return value;
        }

        public void increase() {
            this.value += 1;
        }
        public void decrease() {
            this.value -= 1;
        }
        public void increase(int increaseBy) {
            if (increaseBy >= 0){
                this.value += increaseBy;
            }
        }
        public void decrease(int decreaseBy) {
            if (decreaseBy >= 0){
                this.value += decreaseBy;
            }
        }
        

   }

