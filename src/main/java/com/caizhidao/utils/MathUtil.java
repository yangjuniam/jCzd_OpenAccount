package com.caizhidao.utils;

import java.util.Random;
/**
 * 数学运算 Util 类
 * @author Jail Hu
 *  
 */
public class MathUtil {

	/**
	 * 获得整数随机数，指定最大最小值
	 * @param min 最小值
	 * @param max 最大值
	 * @return int 
	 */
	public static int random(int min, int max) {
		Random rand = new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (max - min + 1) + min;
	}
}
