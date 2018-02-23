package org.curvedrawer.path;

import org.waltonrobotics.controller.Path;
import org.waltonrobotics.motion.BezierCurve;
import org.waltonrobotics.motion.Spline;

public enum PathType {
	BEZIER_CURVE(BezierCurve.class), SPLINE(Spline.class);

	private final Class<? extends Path> associatedClass;

	PathType(Class<? extends org.waltonrobotics.controller.Path> associatedClass) {

		this.associatedClass = associatedClass;
	}

	public Class<? extends Path> getAssociatedClass() {
		return associatedClass;
	}

	@Override
	public String toString() {
		return "PathType{" +
			"associatedClass=" + associatedClass +
			'}';
	}

	private void writeObject(java.io.ObjectOutputStream out)
		throws java.io.NotSerializableException {
		throw new java.io.NotSerializableException("org.curvedrawer.path.PathType");
	}
}
