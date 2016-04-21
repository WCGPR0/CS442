package wordCount.visitors;

import wordCount.treesForStrings.TreeBuilder;

public interface TreeProcessingVisitorI{
    public void visit(TreeBuilder tb) throws Exception;
}