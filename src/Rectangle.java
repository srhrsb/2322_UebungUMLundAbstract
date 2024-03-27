public class Rectangle extends Shape {
        private float height;
        private float width;
        public Rectangle( float height, float width ){
            this.height = height;
            this.width = width;
        }

        public float calculateArea(){
            return height * width;
        }
}

