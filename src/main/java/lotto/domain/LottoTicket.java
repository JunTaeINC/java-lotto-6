package lotto.domain;

import java.util.List;

public class LottoTicket {

	private final List<Lotto> lottoList;

	public LottoTicket(List<Lotto> lottoList) {
		this.lottoList = lottoList;
	}
}