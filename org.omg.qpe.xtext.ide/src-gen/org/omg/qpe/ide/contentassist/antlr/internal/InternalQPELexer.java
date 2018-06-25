package org.omg.qpe.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQPELexer extends Lexer {
    public static final int RULE_BOOLEAN=10;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_VALUE=7;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=9;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int RULE_LONG=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalQPELexer() {;} 
    public InternalQPELexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQPELexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQPE.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:11:7: ( 'namespace' )
            // InternalQPE.g:11:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:12:7: ( 'as' )
            // InternalQPE.g:12:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:13:7: ( '/' )
            // InternalQPE.g:13:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:14:7: ( '::' )
            // InternalQPE.g:14:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:15:7: ( '[' )
            // InternalQPE.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:16:7: ( ']' )
            // InternalQPE.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:17:7: ( ',' )
            // InternalQPE.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:18:7: ( '=' )
            // InternalQPE.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:19:7: ( '.' )
            // InternalQPE.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_VALUE"
    public final void mRULE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1948:12: ( ( RULE_STRING | RULE_INT | RULE_LONG | RULE_DOUBLE | RULE_BOOLEAN ) )
            // InternalQPE.g:1948:14: ( RULE_STRING | RULE_INT | RULE_LONG | RULE_DOUBLE | RULE_BOOLEAN )
            {
            // InternalQPE.g:1948:14: ( RULE_STRING | RULE_INT | RULE_LONG | RULE_DOUBLE | RULE_BOOLEAN )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalQPE.g:1948:15: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 2 :
                    // InternalQPE.g:1948:27: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 3 :
                    // InternalQPE.g:1948:36: RULE_LONG
                    {
                    mRULE_LONG(); 

                    }
                    break;
                case 4 :
                    // InternalQPE.g:1948:46: RULE_DOUBLE
                    {
                    mRULE_DOUBLE(); 

                    }
                    break;
                case 5 :
                    // InternalQPE.g:1948:58: RULE_BOOLEAN
                    {
                    mRULE_BOOLEAN(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALUE"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            // InternalQPE.g:1950:20: ( RULE_INT ( 'L' | 'l' ) )
            // InternalQPE.g:1950:22: RULE_INT ( 'L' | 'l' )
            {
            mRULE_INT(); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            // InternalQPE.g:1952:22: ( RULE_INT '.' RULE_INT )
            // InternalQPE.g:1952:24: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            // InternalQPE.g:1954:23: ( ( 'true' | 'false' ) )
            // InternalQPE.g:1954:25: ( 'true' | 'false' )
            {
            // InternalQPE.g:1954:25: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQPE.g:1954:26: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalQPE.g:1954:33: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1956:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQPE.g:1956:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQPE.g:1956:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQPE.g:1956:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalQPE.g:1956:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQPE.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1958:10: ( ( '0' .. '9' )+ )
            // InternalQPE.g:1958:12: ( '0' .. '9' )+
            {
            // InternalQPE.g:1958:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQPE.g:1958:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1960:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQPE.g:1960:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQPE.g:1960:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQPE.g:1960:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQPE.g:1960:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalQPE.g:1960:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQPE.g:1960:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalQPE.g:1960:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQPE.g:1960:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalQPE.g:1960:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQPE.g:1960:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1962:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQPE.g:1962:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQPE.g:1962:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQPE.g:1962:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1964:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQPE.g:1964:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQPE.g:1964:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQPE.g:1964:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalQPE.g:1964:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQPE.g:1964:41: ( '\\r' )? '\\n'
                    {
                    // InternalQPE.g:1964:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalQPE.g:1964:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1966:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQPE.g:1966:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQPE.g:1966:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQPE.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQPE.g:1968:16: ( . )
            // InternalQPE.g:1968:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalQPE.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=17;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalQPE.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalQPE.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalQPE.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalQPE.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalQPE.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalQPE.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalQPE.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalQPE.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalQPE.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalQPE.g:1:64: RULE_VALUE
                {
                mRULE_VALUE(); 

                }
                break;
            case 11 :
                // InternalQPE.g:1:75: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalQPE.g:1:83: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalQPE.g:1:92: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalQPE.g:1:104: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalQPE.g:1:120: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalQPE.g:1:136: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalQPE.g:1:144: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\2\uffff\1\4\4\uffff";
    static final String DFA1_eofS =
        "\7\uffff";
    static final String DFA1_minS =
        "\1\42\1\uffff\1\56\4\uffff";
    static final String DFA1_maxS =
        "\1\164\1\uffff\1\154\4\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\5\1\2\1\3\1\4";
    static final String DFA1_specialS =
        "\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\4\uffff\1\1\10\uffff\12\2\54\uffff\1\3\15\uffff\1\3",
            "",
            "\1\6\1\uffff\12\2\22\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "1948:14: ( RULE_STRING | RULE_INT | RULE_LONG | RULE_DOUBLE | RULE_BOOLEAN )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\2\24\1\30\1\22\5\uffff\2\22\1\45\2\24\1\22\3\uffff\1\24\1\uffff\1\53\20\uffff\1\45\2\24\1\uffff\1\24\3\uffff\3\24\1\45\2\24\1\45\3\24\1\71\1\uffff";
    static final String DFA14_eofS =
        "\72\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\163\1\52\1\72\5\uffff\2\0\1\60\1\162\1\141\1\101\3\uffff\1\155\1\uffff\1\60\11\uffff\2\0\1\uffff\2\0\2\uffff\1\60\1\165\1\154\1\uffff\1\145\1\uffff\2\0\1\145\2\163\1\60\1\145\1\160\1\60\1\141\1\143\1\145\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\141\1\163\1\57\1\72\5\uffff\2\uffff\1\71\1\162\1\141\1\172\3\uffff\1\155\1\uffff\1\172\11\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\71\1\165\1\154\1\uffff\1\145\1\uffff\2\uffff\1\145\2\163\1\172\1\145\1\160\1\172\1\141\1\143\1\145\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\6\uffff\1\13\1\20\1\21\1\uffff\1\13\1\uffff\1\16\1\17\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\12\2\uffff\2\12\3\uffff\1\20\1\uffff\1\2\15\uffff\1\1";
    static final String DFA14_specialS =
        "\1\2\11\uffff\1\10\1\5\23\uffff\1\6\1\1\1\uffff\1\7\1\4\10\uffff\1\0\1\3\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\12\4\22\1\13\4\22\1\7\1\22\1\11\1\3\12\14\1\4\2\22\1\10\3\22\32\20\1\5\1\22\1\6\1\17\1\20\1\22\1\2\4\20\1\16\7\20\1\1\5\20\1\15\6\20\uff85\22",
            "\1\23",
            "\1\25",
            "\1\26\4\uffff\1\27",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "\42\40\1\41\71\40\1\37\uffa3\40",
            "\47\43\1\44\64\43\1\42\uffa3\43",
            "\12\46",
            "\1\47",
            "\1\50",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "\1\52",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\54",
            "\42\40\1\41\71\40\1\37\uffa3\40",
            "",
            "\0\55",
            "\47\43\1\44\64\43\1\42\uffa3\43",
            "",
            "",
            "\12\46",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "",
            "\42\40\1\41\71\40\1\37\uffa3\40",
            "\47\43\1\44\64\43\1\42\uffa3\43",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\64",
            "\1\65",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( (LA14_44=='\"') ) {s = 33;}

                        else if ( (LA14_44=='\\') ) {s = 31;}

                        else if ( ((LA14_44>='\u0000' && LA14_44<='!')||(LA14_44>='#' && LA14_44<='[')||(LA14_44>=']' && LA14_44<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( (LA14_32=='\"') ) {s = 33;}

                        else if ( (LA14_32=='\\') ) {s = 31;}

                        else if ( ((LA14_32>='\u0000' && LA14_32<='!')||(LA14_32>='#' && LA14_32<='[')||(LA14_32>=']' && LA14_32<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='n') ) {s = 1;}

                        else if ( (LA14_0=='a') ) {s = 2;}

                        else if ( (LA14_0=='/') ) {s = 3;}

                        else if ( (LA14_0==':') ) {s = 4;}

                        else if ( (LA14_0=='[') ) {s = 5;}

                        else if ( (LA14_0==']') ) {s = 6;}

                        else if ( (LA14_0==',') ) {s = 7;}

                        else if ( (LA14_0=='=') ) {s = 8;}

                        else if ( (LA14_0=='.') ) {s = 9;}

                        else if ( (LA14_0=='\"') ) {s = 10;}

                        else if ( (LA14_0=='\'') ) {s = 11;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 12;}

                        else if ( (LA14_0=='t') ) {s = 13;}

                        else if ( (LA14_0=='f') ) {s = 14;}

                        else if ( (LA14_0=='^') ) {s = 15;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 16;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 17;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='-'||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( (LA14_45=='\'') ) {s = 36;}

                        else if ( (LA14_45=='\\') ) {s = 34;}

                        else if ( ((LA14_45>='\u0000' && LA14_45<='&')||(LA14_45>='(' && LA14_45<='[')||(LA14_45>=']' && LA14_45<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( (LA14_35=='\'') ) {s = 36;}

                        else if ( (LA14_35=='\\') ) {s = 34;}

                        else if ( ((LA14_35>='\u0000' && LA14_35<='&')||(LA14_35>='(' && LA14_35<='[')||(LA14_35>=']' && LA14_35<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_11 = input.LA(1);

                        s = -1;
                        if ( (LA14_11=='\\') ) {s = 34;}

                        else if ( ((LA14_11>='\u0000' && LA14_11<='&')||(LA14_11>='(' && LA14_11<='[')||(LA14_11>=']' && LA14_11<='\uFFFF')) ) {s = 35;}

                        else if ( (LA14_11=='\'') ) {s = 36;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( ((LA14_34>='\u0000' && LA14_34<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_10 = input.LA(1);

                        s = -1;
                        if ( (LA14_10=='\\') ) {s = 31;}

                        else if ( ((LA14_10>='\u0000' && LA14_10<='!')||(LA14_10>='#' && LA14_10<='[')||(LA14_10>=']' && LA14_10<='\uFFFF')) ) {s = 32;}

                        else if ( (LA14_10=='\"') ) {s = 33;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}