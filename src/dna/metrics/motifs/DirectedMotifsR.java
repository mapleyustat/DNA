package dna.metrics.motifs;

import dna.updates.batch.Batch;
import dna.updates.update.Update;

public class DirectedMotifsR extends DirectedMotifs {

	public DirectedMotifsR() {
		super("DirectedMotifsR", ApplicationType.Recomputation,
				MetricType.exact);
	}

	@Override
	public boolean applyBeforeBatch(Batch b) {
		return false;
	}

	@Override
	public boolean applyAfterBatch(Batch b) {
		return false;
	}

	@Override
	public boolean applyBeforeUpdate(Update u) {
		return false;
	}

	@Override
	public boolean applyAfterUpdate(Update u) {
		return false;
	}

}
