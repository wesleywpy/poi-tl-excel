package com.tl.core.data;

/**
 * PictureRenderData
 *
 * @author WangPanYong
 * @since 2023/07/26
 */
public abstract class PictureRenderData implements RenderData {

	/**
	 * 图片字节数组
	 *
	 * @return byte[]
	 * @author Wesley
	 * @since 2023/12/04
	 **/
	public abstract byte[] read();

	/**
	 *
	 * @return java.lang.String 图片名称
	 * @author Wesley
	 * @since 2023/12/05
	 **/
	public abstract String name();
}
