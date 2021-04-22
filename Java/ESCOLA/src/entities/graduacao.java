package entities;

public class graduacao extends estudante {
		//atributos
		private double bonus = 2;
		
		//construtores
		public graduacao(int matricula, String cpf) {
			super(matricula, cpf);
		}
		//encapsulamento
		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
		
		public void usarBonus (int media) {
			if (media < 0) {
				super.incluirPontos(media + bonus);
			}
		}
		
}
