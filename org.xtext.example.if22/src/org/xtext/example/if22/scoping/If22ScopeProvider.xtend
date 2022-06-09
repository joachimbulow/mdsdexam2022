/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.xtext.example.if22.if22.EndingTarget
import org.eclipse.xtext.EcoreUtil2
import org.xtext.example.if22.if22.Program
import java.util.List
import org.xtext.example.if22.if22.End
import java.util.ArrayList
import org.xtext.example.if22.if22.Announcement
import org.xtext.example.if22.if22.Target
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class If22ScopeProvider extends AbstractIf22ScopeProvider {
	override getScope(EObject context, EReference reference) {
		switch(context){
			EndingTarget: {
				val currentProgram = EcoreUtil2.getContainerOfType(context, Program);
				var allStatements = currentProgram.scenarios.map[ s | s.statements].flatten();
				var allEnds = new ArrayList<End>();
				for (s : allStatements){ 
					if (s instanceof End) {
						allEnds.add(s);
					}
				}
				return Scopes.scopeFor(allEnds);
			}
		}
		
		return super.getScope(context, reference)
	}
}
