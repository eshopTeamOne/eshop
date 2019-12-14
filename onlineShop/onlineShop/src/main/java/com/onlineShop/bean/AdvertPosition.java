package com.onlineShop.bean;

import java.util.Date;

public class AdvertPosition
{
	private Short recId;

	private String imgUrl;

	private String imgLink;

	private Date modified;

	private Date created;

	public Short getRecId()
	{
		return recId;
	}

	public void setRecId(Short recId)
	{
		this.recId = recId;
	}

	public String getImgUrl()
	{
		return imgUrl;
	}

	public void setImgUrl(String imgUrl)
	{
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	public String getImgLink()
	{
		return imgLink;
	}

	public void setImgLink(String imgLink)
	{
		this.imgLink = imgLink == null ? null : imgLink.trim();
	}

	public Date getModified()
	{
		return modified;
	}

	public void setModified(Date modified)
	{
		this.modified = modified;
	}

	public Date getCreated()
	{
		return created;
	}

	public void setCreated(Date created)
	{
		this.created = created;
	}
}