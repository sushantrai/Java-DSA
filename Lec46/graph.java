package Lec46;
import java.security.cert.PolicyQualifierInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class graph {
    HashMap<Integer,HashMap<Integer,Integer>>map;
    public graph(int v)
    {
        map=new HashMap<>();
        for(int i=0;i<=v;i++)
        {
            map.put(i, new HashMap<>());
        }
    }
    public void addedge(int v1,int v2,int cost)
    {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
    public boolean containsedge(int v1,int v2)
    {
        return map.get(v1).containsKey(v2);
    }
    public boolean containsvertex(int v1)
    {
        return map.containsKey(v1);
    }
    public int noofedge()
    {
        int sum=0;
        for(int key:map.keySet())
        {
            sum+=map.get(key).size();
        }
        return sum/2;
    }
    public void removeedge(int v1,int v2)
    {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removertex(int v1)
    {
        for(int nbrs:map.get(v1).keySet())
        {
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }
    public void display()
    {
        for(int key:map.keySet())
        {
            System.out.println(key + "-->" + map.get(key));
        }
    }
    public boolean haspath(int src,int des,HashSet<Integer>visited)
    {
        if(src==des)
        {
            return true;
        }
        for(int nbrs:map.get(src).keySet())
        {
            if(!visited.contains(nbrs)){
            boolean ans=haspath(nbrs, des,visited);
            if(ans==true)
            {
                return ans;
            }
        }
        }
        return false;
    }
    public void allpath(int src,int des,HashSet<Integer>visited,String ans)
    {
        if(src==des)
        {
            System.out.println(ans);
            return;
        }
        for(int nbrs:map.get(src).keySet())
        {
            if(!visited.contains(nbrs))
            {
                allpath(src, des, visited, ans+src);
            }
        }
        visited.remove(src);
    }
    public boolean BFS(int src,int des)
    {
        Queue<Integer>qq=new LinkedList<>();
        qq.add(src);
        HashSet<Integer>visited=new HashSet<>();
        while(!qq.isEmpty())
        {
            int rv=qq.poll();
            if(visited.contains(rv))
            {
                continue;
            }
            if(des==rv)
            {
                return true;
            }
            visited.add(rv);
            for(int nbrs:map.get(rv).keySet())
            {
                if(!visited.contains(nbrs))
                {
                    qq.add(nbrs);
                }
            }

        }
        return false;
    }
}
