package data;

import data.pojo.Title;

import tree.TitleTreeNode;


public class TitleList {
	public final static String Title = "Title";
	
	private TitleTreeNode root;
	public TitleList() {
		root = new TitleTreeNode(null, new TitleTreeNode[] {
				new TitleTreeNode(new Title("税收资讯"), new TitleTreeNode[] {
					new TitleTreeNode(new Title("同城通办"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("查询业务"))
					}),
					new TitleTreeNode(new Title("春风行动"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("新增信息")),
						new TitleTreeNode(new Title("我创建的问题")),
						new TitleTreeNode(new Title("待办问题")),
						new TitleTreeNode(new Title("已处理问题"))
					}),
					new TitleTreeNode(new Title("实时热点"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("新增信息")),
						new TitleTreeNode(new Title("我创建的问题")),
						new TitleTreeNode(new Title("待办问题")),
						new TitleTreeNode(new Title("已处理问题"))
					}),
					new TitleTreeNode(new Title("温馨提示"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("新增信息")),
						new TitleTreeNode(new Title("我创建的问题")),
						new TitleTreeNode(new Title("待办问题")),
						new TitleTreeNode(new Title("已处理问题"))
					})
				}),
				new TitleTreeNode(new Title("办税服务"), new TitleTreeNode[] {
					new TitleTreeNode(new Title("纳税人学堂"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("新增信息")),
						new TitleTreeNode(new Title("我创建的问题")),
						new TitleTreeNode(new Title("待办问题")),
						new TitleTreeNode(new Title("已处理问题"))
					})
				}),
				new TitleTreeNode(new Title("组织管理"), new TitleTreeNode[] {
					new TitleTreeNode(new Title("用户管理")),
					new TitleTreeNode(new Title("权限控制")),
					new TitleTreeNode(new Title("流程控制"))
				})
		});
	}
	
	public TitleTreeNode getRoot() {
		return root;
	}
}
