package com.jsa82016voteapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Votes {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Boolean upvote;
	
	@ManyToOne
	@JoinColumn(name="userid", insertable=false, updatable=false)
	private User user;
	private Integer userid;
	
	@ManyToOne
	@JoinColumn(name="featuresid", insertable=false, updatable=false)
	private Features features;
	private Integer featuresid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getUpvote() {
		return upvote;
	}
	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Features getFeatures() {
		return features;
	}
	public void setFeatures(Features features) {
		this.features = features;
	}
	public Integer getFeaturesid() {
		return featuresid;
	}
	public void setFeaturesid(Integer featuresid) {
		this.featuresid = featuresid;
	}
	
	
}
