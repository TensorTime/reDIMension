package com.tensortime.redimection.compat.crafttweaker;

import crafttweaker.IAction;
import java.util.List;
import com.tensortime.redimection.ReDIMEction;

public class ActionAddSourceRestriction implements IAction {

	private final List<Integer> sources;
	private final Integer dimensionId;

	public ActionAddSourceRestriction(List<Integer> sources, Integer dimensionId) {

		this.sources = sources;
		this.dimensionId = dimensionId;
	}

	@Override
	public void apply() {

		ReDIMEction.DESTINATION_MAP.put(this.dimensionId, this.sources);
	}

	@Override
	public String describe() {

		return String.format("Dimension %d has new source dimension restrictions", this.dimensionId);
	}
}
