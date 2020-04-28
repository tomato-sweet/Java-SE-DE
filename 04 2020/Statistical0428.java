import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/*
请实现接口：
unsigned int  AddCandidate (char* pCandidateName);
功能：设置候选人姓名输入： char* pCandidateName 候选人姓名输出：无返回：输入值非法返回0，已经添加过返回0 ，添加成功返回1
Void Vote(char* pCandidateName);功能：投票输入： char* pCandidateName 候选人姓名输出：无返回：无

unsigned int  GetVoteResult (char* pCandidateName);
功能：获取候选人的票数。如果传入为空指针，返回无效的票数，同时说明本次投票活动结束，释放资源输入： char* pCandidateName 候选人姓名。
当输入一个空指针时，返回无效的票数
输出：无返回：该候选人获取的票数

void Clear()
// 功能：清除投票结果，释放所有资源// 输入：// 输出：无// 返回

输入描述:
输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。

输出描述:
每行输出候选人的名字和得票数量。
 */
public class Statistical0428 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            //统计人头
            int n = scan.nextInt();
            LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
            scan.nextLine();
            String str = scan.nextLine();
            String[] array = str.split(" ");
            for(int i=0;i<array.length;i++){
                map.put(array[i],0);
            }
            map.put("Invalid",0);
            //投票计数
            int m = scan.nextInt();
            scan.nextLine();
            String strr = scan.nextLine();
            String[] arrays = strr.split(" ");
            for(String s :arrays){
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            Set<String> set = map.keySet();
            for(String s :set){
                System.out.println(s+" : "+map.get(s));
            }
        }
    }
}