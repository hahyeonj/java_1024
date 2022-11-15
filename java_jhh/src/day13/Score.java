package day13;

public class Score {

	//필드 : 과목, 학기, 중간, 기말, 수행평가, 총점
		private String title;
		private int term, midScore, finalScore, Performance;
		private double total;
		private double midRate = 0.4, finalRate = 0.5, performanceRate = 0.1;

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getTerm() {
			return term;
		}
		public void setTerm(int term) {
			this.term = term;
		}
		public int getMidScore() {
			return midScore;
		}
		public void setMidScore(int midScore) {
			this.midScore = midScore;
		}
		public int getFinalScore() {
			return finalScore;
		}
		public void setFinalScore(int finalScore) {
			this.finalScore = finalScore;
		}
		public int getPerformance() {
			return Performance;
		}
		public void setPerformance(int Performance) {
			this.Performance = Performance;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
				
		@Override
		public String toString() {
			return "[" + title + " 학기" + term + term + ", midScore=" + midScore + ", finalScore=" + finalScore
					+ ", getPerformance=" + Performance + ", total=" + total + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Score other = (Score) obj;
			if (finalScore != other.finalScore)
				return false;
			if (getPerformance != other.getPerformance)
				return false;
			if (midScore != other.midScore)
				return false;
			if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
				return false;
			return true;
		}
		public Score(String title, int term, int midScore, int finalScore, int getPerformance, double total) {
			super();
			this.title = title;
			this.term = term;
			this.midScore = midScore;
			this.finalScore = finalScore;
			this.Performance = Performance;
			this.total = total;
		}
		
		//메소드 : equals() : 성적 추가시 활용, toString() 성적 출력시 사용
		//		getter, setter
		
		
		//생성자 : 과목, 학기, 중간, 기말, 수행평가가 필요한 생성자
		
		
		//		:과목, 학기가 필요한 생성자(성적이 같은지 확인할 때)
		public Score(Score s) {
			this(s.title, s.term, s.midScore, s.finalScore, s.Performance)
		
	}

}
