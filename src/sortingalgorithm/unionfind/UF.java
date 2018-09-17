package sortingalgorithm.unionfind;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/9/17.
 */
public class UF {
    private int[] id; // 分量id（以触点作为索引）
    private int count; // 分量数量

    public UF(int N) {
        count = N;
        id = new int[N];
        // 初始化分量id数组
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }
    /**
     *判断两个数是否属于同一个集合
     */
    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    /*
     * 找到某个节点中的元素
     */
    private int find(int a) {
        return id[a];
    }

    /*
     * 连接两个节点，把index较小者作为flag
     */
    private void union(int a, int b) {
        //注意：这里不仅仅要修改id[a]或者id[b]的值，而是需要修改所有该集合中的值！！
        if(find(a)!=find(b)){
            if(a<=b)
                for(int i=0;i<id.length;i++){
                    if(id[i]==id[b])
                        id[i]=a;
                }
            else
                for(int i=0;i<id.length;i++){
                    if(id[i]==id[a])
                        id[i]=b;
                }
            count--;
        }else{
            return;
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //标准输入的第一行有两个数：第一个为节点总个数（序号从0到N-1）
        //第二个数是总的行数
        System.out.println("请输入n：");
        int N=sc.nextInt();
        System.out.println("请输入line：");
        int line=sc.nextInt();
        UF uf=new UF(N);
        int temp1,temp2;
        System.out.println(uf.printId(uf));
        for(int i=0;i<line;i++){
            temp1=sc.nextInt();
            temp2=sc.nextInt();
            if(!uf.connected(temp1, temp2)){
                uf.union(temp2, temp1);
            }
            System.out.println(uf.count);
            System.out.println(uf.printId(uf));

        }
        System.out.println("连接数："+uf.count);
        sc.close();

    }


    public String printId(UF uf) {
        StringBuilder  sb = new StringBuilder();
        sb.append("[");
        for(int i = 0;i<uf.id.length; i++){
            if(i < uf.id.length - 1){
                sb.append(uf.id[i]);
                sb.append(",");
            }else {
                sb.append(uf.id[i]);
                sb.append("]");
            }
        }
        return sb.toString();
    }
}
