package com.finalproject.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ProjectInfo implements Serializable {
	@Id
	@Column(name = "projectName")
	private String projectName;

	@Column(name = "designed")
	private long designed;
	@Column(name = "ready")
	private long ready;
	@Column(name = "manual")
	private long manual;
	@Column(name = "automated")
	private long automated;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public long getDesigned() {
		return designed;
	}

	public void setDesigned(long designed) {
		this.designed = designed;
	}

	public long getReady() {
		return ready;
	}

	public void setReady(long ready) {
		this.ready = ready;
	}

	public long getManual() {
		return manual;
	}

	public void setManual(long manual) {
		this.manual = manual;
	}

	public long getAutomated() {
		return automated;
	}

	public void setAutomated(long automated) {
		this.automated = automated;
	}

}