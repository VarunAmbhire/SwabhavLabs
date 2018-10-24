package com.techlab.rtoapp;

import java.util.ArrayList;

public class Search {

	public ArrayList<RTO> search(String code, ArrayList<RTO> rtoMain) {
		ArrayList<RTO> rtos = new ArrayList<>();

		for (RTO rto : rtoMain) {
			if (rto.getState().toLowerCase().contains(code.toLowerCase())) {
				rtos.add(rto);
			}
		}
		return rtos;
	}
}
