class Point {
		String id;
		double x,y;
		//TODO add new variable

		//TODO constructor
		public Point(String id,double x,double y) {
			this.x=x;
			this.y=y;
			this.id=id;
		}
		//TODO setters and getters
		public void setId(String id) {
			this.id=id;
		}
		public void setX(double x) {
			this.x=x;
		}
		public void setY(double y) {
			this.y=y;
		}
		public double getX() {
			return x;
		}
		public double getY() {
			return y;
		}
		public String getId() {
			return id;
		}

		public void move (char xDirection, char yDirection) {
			//TODO
			x = x+xDirection;
			y = y+yDirection;
		}

		public void draw () {
			//TODO
			System.out.print("Tockata se naogja na: "+x+" "+y);
		}



	}