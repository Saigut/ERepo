package tree;

import org.zkoss.zul.AbstractTreeModel;


public class AbTreeModel extends AbstractTreeModel<TitleTreeNode> {
	
	private static final long serialVersionUID = -5897401917995314396L;

	public AbTreeModel(TitleTreeNode root) {
		super(root);
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean isLeaf(TitleTreeNode node) {
		return node.isLeaf();
//		return false;
	}

	@Override
	public TitleTreeNode getChild(TitleTreeNode parent, int index) {
			return (TitleTreeNode)parent.getChildAt(index);
//		return null;
	}

	@Override
	public int getChildCount(TitleTreeNode parent) {
		return parent.getChildCount();
//		return 0;
	}

}
