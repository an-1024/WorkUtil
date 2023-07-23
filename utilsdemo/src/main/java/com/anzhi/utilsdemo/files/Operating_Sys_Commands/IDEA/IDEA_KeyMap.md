# IDEA 列模式多行编辑 - Win

第一步：File——>Settings——>搜索 column selection mode
（windows上默认的快捷键是：shift + alt + insert）

第二步：鼠标放在你需要多行编辑的地方，ctrl + A 全选需要执行多行编辑的内容

第三步：按住shift + alt，再按2次insert，全选的内容就出来了，就可以自由编辑了

# IDEA 字符串大小写转换

MAC：command + shift + u
Win：ctrl + shift + u


# idea 编译代码报错

错误日志:

```text
java: JPS incremental annotation processing is disabled. Compilation results on partial recompilation may be inaccurate. Use build process "jps.track.ap.dependencies" VM flag to enable/disable incremental annotation processing environment.
```
解决方案：

![](../../photo/7.idea_JPS_Error.png)
```text
-Djps.track.ap.dependencies=false
```

