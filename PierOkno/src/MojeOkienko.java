import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MojeOkienko extends JFrame implements ActionListener //implements ActionListener - implementujemy do klasy okienka, �eby przyciski czeka�y na znak
{

	public MojeOkienko () //konstruktor okienka
	{
		setSize(600,600); // rozmiary okna
		setTitle("Moje Pierwsze Okno"); // tytu� okna
		setLayout(null); // kozystamy z layout null
		JButton bPodajDate = new JButton("Podaj dat�"); // tworzymy przciesk (action sourse)
		
		bPodajDate.setBounds(100, 50, 150, 50); // nadaje buttonowi rozmiary 
		add(bPodajDate); // dodajemy go do panelu
		bPodajDate.addActionListener(this); // odajemy czujnik action
		JButton bWyjscie = new JButton("Wyjscie"); // event sourse
		bWyjscie.setBounds(255, 50, 150, 50);
		add(bWyjscie);
		bPodajDate.addActionListener(this); // odajemy czujnik action
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MojeOkienko okienko = new MojeOkienko();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // metoda zamyknia okienka
		okienko.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object zrodlo = 
		System.out.println(new Date());
	}

	
	
}
