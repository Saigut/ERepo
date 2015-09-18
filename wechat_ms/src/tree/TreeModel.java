package tree;

import org.zkoss.zul.DefaultTreeModel;

import data.pojo.Title;
import tree.TitleTreeNode;

public class TreeModel extends DefaultTreeModel<Title> {

	private static final long serialVersionUID = -3052489101685670174L;

	public TreeModel(TitleTreeNode root) {
		super(root);
		// TODO Auto-generated constructor stub
	}

}
