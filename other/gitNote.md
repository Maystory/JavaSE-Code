|      | git add .  //提交所有                        |
| ---- | ---------------------------------------- |
|      | git add a.txt //提交                       |
|      | git commit -m "msg"  //从暂存区提交到本地仓库       |
|      | git checkout 文件名  // 将暂存区的内容还原到工作区       |
|      |                                          |
|      | git push -u origin master //推送到GitHub    |
|      |                                          |
|      | git log //查看提交日志/commitID                |
|      |                                          |
|      | git config --list  //查看配置信息              |
|      |                                          |
|      | git reset --hard  f5af9d46f65  // 撤回到某个保存点（commitID） |
|      |                                          |
|      | git pull origin master  // 从远程仓库拉回主分支到本地仓库合并 |
|      |                                          |
|      | git init //初始化一个仓库                       |
|      |                                          |
|      | git branch   //查看当前所在的分支                 |
|      |                                          |
|      | git branch 分支名  //创建一个新的分支               |
|      |                                          |
|      | git checkout 分支名  //切换到某一个分支上            |
|      |                                          |
|      | git branch -d/D  分支名  //删除某个分支           |
|      |                                          |
|      | git merge master 分支名  // 将某个分支合并到主分支上去   |
|      |                                          |
|      | //远程仓库地址必须为 xxx.git                      |
|      | git init --bare  //创建一个“裸”仓库             |
|      |                                          |
|      | git push 远程仓库地址 分支名   // 将本地仓库的某个分支推送到远程仓库 |
|      |                                          |
|      | git pull 远程仓库地址 分支名   //从远程仓库拉过来某个分支到某个分支 |
|      |                                          |
|      | git remote add 远程地址别名 远程地址路径  //给远程地址取一个短的别名（一般是origin） |
|      |                                          |
|      | git clone 远程仓库地址  // 将远程仓库克隆到本地成一个仓库     |