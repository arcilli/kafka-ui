import React from 'react';
import Tippy from '@tippyjs/react';

import * as S from './TooltipComponent.styled';

export interface PropsTypes {
  value: string;
  messageTooltip: string;
}
const TooltipComponent: React.FC<PropsTypes> = ({ value, messageTooltip }) => {
  return (
    <Tippy content={<S.MessageTooltip>{messageTooltip}</S.MessageTooltip>}>
      <span>{value}</span>
    </Tippy>
  );
};
export default TooltipComponent;