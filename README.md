# CustomProgressBar
自定义的一个进度条，两个数值，根据大小关系改变所占比，中间的分隔线是斜线
![image](https://github.com/chen6665758/CustomProgressBar/blob/master/pic.png)
<br />
```
<com.example.cg.custompre.custom.mPre
        android:id="@+id/myPre"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_margin="10dp"
        app:TextSize="14dp"
        app:iNum="40"
        app:iColor="#ff4455"
        app:oNum = "60"
        app:oColor="#004455"
        app:Inclination = "30"
        app:iTextColor = "#ffffff"
        app:oTextColor = "#ffffff"/>
```
<br />
TextSize  :  显示百分比文字的大小　　　　　　<br />
iNum      :  左边的数据量　　　　　　　　　　<br />
iColor    :  左边百分条的颜色　　　　　　　　<br />
oNum      :  右边的数据量　　　　　　　　　　<br />
oColor    :　右边百分条的颜色　　　　　　　　<br />
Inclination : 中间分隔线的角度　　　　　　　 <br />
iTextColor  : 左边百分比文字的颜色           <br />
oTextColor  : 右边百分比文字的颜色

现在提供两个外部接口：　<br />
/**<br />
     * 动态设置进值<br />
     * @param iNum<br />
     */<br />
public void setINum(float iNum)<br />

/**<br />
     * 动态设置出值<br />
     * @param oNum<br />
     */<br />
    public void setONum(float oNum)<br />
