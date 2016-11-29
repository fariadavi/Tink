package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaRanking;

public class RankingHandler {
	
	private TelaRanking rankingView;
	
	public RankingHandler(TelaRanking rankingView) {
		this.rankingView = rankingView;
		
		this.rankingView.addRankingListener(new RankingListener());
	}
	
	class RankingListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			rankingView.dispose();
		}
	}
}
