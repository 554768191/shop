<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'left.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->

					<ul class="nav nav-list">
						<li>
							<a href="index.html" class="dropdown-toggle">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> 个人中心 </span>

								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										修改密码
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										工作汇报
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										修改个人信息
									</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 流程类型管理</span>
							</a>
						</li>
						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 流程条目管理</span>

								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增报销申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增办公物品申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增仓库进货申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增借款申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增离职申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增请假申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增调休申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增转正申请
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增出差申请
									</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-list" ></i>
								<span class="menu-text"> 用户管理</span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增用户
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										用户列表
									</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 角色管理</span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增角色
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										角色列表
									</a>
								</li>
							</ul>
						</li>
						<li class="active open">
							<a href="#" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 部门管理</span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li   class="active">
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										新增部门
									</a>
								</li>
								<li>
									<a href="form-elements.html">
										<i class="icon-double-angle-right"></i>
										部门列表
									</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 客户管理</span>
							</a>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 物品管理</span>
							</a>
						</li>

						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 维修管理</span>
							</a>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 培训管理</span>
							</a>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 店面管理</span>
							</a>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 活动管理</span>
							</a>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 出勤管理</span>
							</a>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 招聘管理</span>
							</a>
						</li>
						<li>
							<a href="#" >
								<i class="icon-list"></i>
								<span class="menu-text"> 产品管理</span>
							</a>
						</li>
						
					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>
  </body>
</html>
