package generics;

public class Shape {
    public class shape<T>{
        private T s;

        public T getS() {
            return s;
        }

        public void setS(T s) {
            this.s = s;
        }

        public shape(){
        }
        public shape(T s) {
            this.s = s;
        }

        class Square {

            Double area;

            public double getArea() {
                return area;
            }

            public void setArea(Double area) {
                this.area = area;
            }
        }


    }
}
