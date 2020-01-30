/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
注意你不能在买入股票前卖出股票。
 */
public class MaxProfit {
    public int maxProfit(int prices[]){
    int minprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    for(int i = 0;i < price.length;i++){
    if(price[i] < minprice)
        minprice = price[i];
    else if (price[i] - minprice > maxprofit)
        maxprofit = price[i] - minprice;
}
return maxprofit;
        }
        }
