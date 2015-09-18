package data;

import data.pojo.Title;

import tree.TitleTreeNode;


public class TitleList {
	public final static String Title = "Title";
	
	private TitleTreeNode root;
	public TitleList() {
		root = new TitleTreeNode(null, new TitleTreeNode[] {
				new TitleTreeNode(new Title("˰����Ѷ"), new TitleTreeNode[] {
					new TitleTreeNode(new Title("ͬ��ͨ��"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("��ѯҵ��"))
					}),
					new TitleTreeNode(new Title("�����ж�"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("������Ϣ")),
						new TitleTreeNode(new Title("�Ҵ���������")),
						new TitleTreeNode(new Title("��������")),
						new TitleTreeNode(new Title("�Ѵ�������"))
					}),
					new TitleTreeNode(new Title("ʵʱ�ȵ�"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("������Ϣ")),
						new TitleTreeNode(new Title("�Ҵ���������")),
						new TitleTreeNode(new Title("��������")),
						new TitleTreeNode(new Title("�Ѵ�������"))
					}),
					new TitleTreeNode(new Title("��ܰ��ʾ"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("������Ϣ")),
						new TitleTreeNode(new Title("�Ҵ���������")),
						new TitleTreeNode(new Title("��������")),
						new TitleTreeNode(new Title("�Ѵ�������"))
					})
				}),
				new TitleTreeNode(new Title("��˰����"), new TitleTreeNode[] {
					new TitleTreeNode(new Title("��˰��ѧ��"), new TitleTreeNode[] {
						new TitleTreeNode(new Title("������Ϣ")),
						new TitleTreeNode(new Title("�Ҵ���������")),
						new TitleTreeNode(new Title("��������")),
						new TitleTreeNode(new Title("�Ѵ�������"))
					})
				}),
				new TitleTreeNode(new Title("��֯����"), new TitleTreeNode[] {
					new TitleTreeNode(new Title("�û�����")),
					new TitleTreeNode(new Title("Ȩ�޿���")),
					new TitleTreeNode(new Title("���̿���"))
				})
		});
	}
	
	public TitleTreeNode getRoot() {
		return root;
	}
}
