package rulebasedrl;

import base.Action;
import base.Context;
import base.Location;
import base.Norm;
import base.Relationship;

import java.util.ArrayList;
import java.util.List;

public class HardCodedCaseNormProvider implements NormProvider {
    @Override
    public List<NormEntry> provide() {
        List<NormEntry> initialNorms = new ArrayList<>();
        initialNorms.add(new NormEntry(new Norm(Context.builder().interactLocation(Location.HOSPITAL).build(),
                Action.WEAR)));
        initialNorms.add(new NormEntry(new Norm(Context.builder().interactLocation(Location.OFFICE).build(),
                Action.WEAR)));
        initialNorms.add(new NormEntry(new Norm(
                Context.builder().observerRelationship(Relationship.FAMILY).build(),
                Action.NOT_WEAR)));
        initialNorms.add(new NormEntry(new Norm(
                Context.builder().observerRelationship(Relationship.FRIEND).build(),
                Action.NOT_WEAR)));
        initialNorms.add(new NormEntry(new Norm(
                Context.builder().observerRelationship(Relationship.COLLEAGUE).build(),
                Action.WEAR)));
        initialNorms.add(new NormEntry(new Norm(
                Context.builder().observerRelationship(Relationship.STRANGER).build(),
                Action.WEAR)));
        initialNorms.add(new NormEntry(new Norm(
                Context.builder().build(), Action.NOT_WEAR)));
        return initialNorms;
    }
}
