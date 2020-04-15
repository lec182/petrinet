package simemodsis;

public class PetrinetObject {
		
		private String name;
		
		public PetrinetObject(String name) {
			super();
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public String setName(String name) {
			return this.name = name;
		}
		
		@Override
		public String toString() {
			return  /*getClass().getSimpleName() + " " + */ name;
		}
}
