class Aluno{
	public String nome;
	public int rg;
	public String dataNascimento;
	public Turma turma;
}
class Funcionario{
	public String nome;
	public double salario;
		
	public void aumentarSalario(double salari) {
		this.salario += 100;
	}
	public void consulta() {
		System.out.println("\n"+this.nome+"\n"+this.salario);
	}
}
class Turma{
	public String periodo;
	public String serie;
	public String sigla;
	public String ensino;
}
public class TestaEscola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
		
		aluno.nome = "Marcão Trintão";
		aluno.rg = (int)(Math.random() * 1000000000);
		aluno.dataNascimento = "13/02/2000";
		aluno.turma = turma1;
		
		
		
		funcionario.nome = "Roger Coala";
		funcionario.salario = 500;
		funcionario2.nome = "Ingrid Vampirica";
		funcionario2.salario = 600;
		System.out.println("Nome: "+funcionario.nome+"\nSalario:"+funcionario.salario+"Nome: "+funcionario2.nome+"\nSalario:"+funcionario2.salario+"\n");
		turma1.periodo = "Matutino";
		turma1.serie = "2°A";
		turma1.sigla = "E.M";
		turma1.ensino = "Ensino Médio";
		System.out.println("Nome: "+aluno.nome+"\nRG: "+aluno.rg+"\nData De Nascimento: "+ aluno.dataNascimento+"\nTurma: "+ aluno.turma.serie);
		turma2.periodo = "vespertino";
		turma2.serie = "8°B";
		turma2.sigla = "E.F";
		turma2.ensino = "Ensino Fundamental";
		
		System.out.println("\nTurma1.\nPeriodo: "+turma1.periodo+"\nSérie: "+turma1.serie+"\nSigla: "+turma1.serie+"\nEnsino:"+turma1.ensino);
		System.out.println("\nTurma2.\nPeriodo: "+turma2.periodo+"\nSérie: "+turma2.serie+"\nSigla: "+turma2.serie+"\nEnsino:"+turma2.ensino);
		
		funcionario.aumentarSalario(funcionario.salario);
		
		funcionario.consulta();
	}

}
